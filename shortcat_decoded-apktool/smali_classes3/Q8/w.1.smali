.class public final LQ8/w;
.super LQ8/g0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final f:Lt/b;

.field private final g:LQ8/e;


# direct methods
.method constructor <init>(LQ8/i;LQ8/e;Lcom/google/android/gms/common/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, LQ8/g0;-><init>(LQ8/i;Lcom/google/android/gms/common/a;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lt/b;

    .line 5
    .line 6
    invoke-direct {p1}, Lt/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LQ8/w;->f:Lt/b;

    .line 10
    .line 11
    iput-object p2, p0, LQ8/w;->g:LQ8/e;

    .line 12
    .line 13
    iget-object p1, p0, LQ8/h;->a:LQ8/i;

    .line 14
    .line 15
    const-string p2, "ConnectionlessLifecycleHelper"

    .line 16
    .line 17
    invoke-interface {p1, p2, p0}, LQ8/i;->d(Ljava/lang/String;LQ8/h;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static u(Landroid/app/Activity;LQ8/e;LQ8/b;)V
    .locals 2

    .line 1
    invoke-static {p0}, LQ8/h;->d(Landroid/app/Activity;)LQ8/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "ConnectionlessLifecycleHelper"

    .line 6
    .line 7
    const-class v1, LQ8/w;

    .line 8
    .line 9
    invoke-interface {p0, v0, v1}, LQ8/i;->b(Ljava/lang/String;Ljava/lang/Class;)LQ8/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LQ8/w;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, LQ8/w;

    .line 18
    .line 19
    invoke-static {}, Lcom/google/android/gms/common/a;->n()Lcom/google/android/gms/common/a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, p0, p1, v1}, LQ8/w;-><init>(LQ8/i;LQ8/e;Lcom/google/android/gms/common/a;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const-string p0, "ApiKey cannot be null"

    .line 27
    .line 28
    invoke-static {p2, p0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object p0, v0, LQ8/w;->f:Lt/b;

    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lt/b;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, LQ8/e;->b(LQ8/w;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private final v()V
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/w;->f:Lt/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt/b;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LQ8/w;->g:LQ8/e;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, LQ8/e;->b(LQ8/w;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method


# virtual methods
.method public final h()V
    .locals 0

    .line 1
    invoke-super {p0}, LQ8/h;->h()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LQ8/w;->v()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    invoke-super {p0}, LQ8/g0;->j()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LQ8/w;->v()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    invoke-super {p0}, LQ8/g0;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ8/w;->g:LQ8/e;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, LQ8/e;->c(LQ8/w;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method protected final m(Lcom/google/android/gms/common/ConnectionResult;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/w;->g:LQ8/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LQ8/e;->D(Lcom/google/android/gms/common/ConnectionResult;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected final n()V
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/w;->g:LQ8/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LQ8/e;->E()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method final t()Lt/b;
    .locals 1

    .line 1
    iget-object v0, p0, LQ8/w;->f:Lt/b;

    .line 2
    .line 3
    return-object v0
.end method
