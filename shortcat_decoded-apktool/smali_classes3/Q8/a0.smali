.class public final LQ8/a0;
.super LQ8/M;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:LQ8/r;

.field private final c:Ln9/j;

.field private final d:LQ8/p;


# direct methods
.method public constructor <init>(ILQ8/r;Ln9/j;LQ8/p;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LQ8/M;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LQ8/a0;->c:Ln9/j;

    .line 5
    .line 6
    iput-object p2, p0, LQ8/a0;->b:LQ8/r;

    .line 7
    .line 8
    iput-object p4, p0, LQ8/a0;->d:LQ8/p;

    .line 9
    .line 10
    const/4 p3, 0x2

    .line 11
    if-ne p1, p3, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2}, LQ8/r;->c()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string p2, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    .line 23
    .line 24
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ8/a0;->d:LQ8/p;

    .line 2
    .line 3
    iget-object v1, p0, LQ8/a0;->c:Ln9/j;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LQ8/p;->a(Lcom/google/android/gms/common/api/Status;)Ljava/lang/Exception;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v1, p1}, Ln9/j;->d(Ljava/lang/Exception;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/a0;->c:Ln9/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln9/j;->d(Ljava/lang/Exception;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(LQ8/E;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LQ8/a0;->b:LQ8/r;

    .line 2
    .line 3
    invoke-virtual {p1}, LQ8/E;->v()LP8/a$f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v1, p0, LQ8/a0;->c:Ln9/j;

    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, LQ8/r;->b(LP8/a$b;Ln9/j;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    goto :goto_0

    .line 15
    :catch_1
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :catch_2
    move-exception p1

    .line 18
    goto :goto_2

    .line 19
    :goto_0
    iget-object v0, p0, LQ8/a0;->c:Ln9/j;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ln9/j;->d(Ljava/lang/Exception;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :goto_1
    invoke-static {p1}, LQ8/c0;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0, p1}, LQ8/a0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :goto_2
    throw p1
.end method

.method public final d(LQ8/v;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/a0;->c:Ln9/j;

    .line 2
    .line 3
    invoke-virtual {p1, v0, p2}, LQ8/v;->d(Ln9/j;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(LQ8/E;)Z
    .locals 0

    .line 1
    iget-object p1, p0, LQ8/a0;->b:LQ8/r;

    .line 2
    .line 3
    invoke-virtual {p1}, LQ8/r;->c()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final g(LQ8/E;)[LO8/c;
    .locals 0

    .line 1
    iget-object p1, p0, LQ8/a0;->b:LQ8/r;

    .line 2
    .line 3
    invoke-virtual {p1}, LQ8/r;->e()[LO8/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
