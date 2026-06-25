.class public final Ly4/b$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private final a:Ly4/b$c;

.field private b:Z

.field private final c:[Z

.field final synthetic d:Ly4/b;


# direct methods
.method public constructor <init>(Ly4/b;Ly4/b$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly4/b$b;->d:Ly4/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ly4/b$b;->a:Ly4/b$c;

    .line 7
    .line 8
    invoke-static {p1}, Ly4/b;->k(Ly4/b;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    new-array p1, p1, [Z

    .line 13
    .line 14
    iput-object p1, p0, Ly4/b$b;->c:[Z

    .line 15
    .line 16
    return-void
.end method

.method private final d(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/b$b;->d:Ly4/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ly4/b$b;->b:Z

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Ly4/b$b;->a:Ly4/b$c;

    .line 9
    .line 10
    invoke-virtual {v1}, Ly4/b$c;->b()Ly4/b$b;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-static {v0, p0, p1}, Ly4/b;->a(Ly4/b;Ly4/b$b;Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    const/4 p1, 0x1

    .line 27
    iput-boolean p1, p0, Ly4/b$b;->b:Z

    .line 28
    .line 29
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    .line 34
    .line 35
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ly4/b$b;->d(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Ly4/b$b;->d(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final c()Ly4/b$d;
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/b$b;->d:Ly4/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ly4/b$b;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ly4/b$b;->a:Ly4/b$c;

    .line 8
    .line 9
    invoke-virtual {v1}, Ly4/b$c;->d()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ly4/b;->S(Ljava/lang/String;)Ly4/b$d;

    .line 14
    .line 15
    .line 16
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    monitor-exit v0

    .line 18
    return-object v1

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    monitor-exit v0

    .line 21
    throw v1
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/b$b;->a:Ly4/b$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly4/b$c;->b()Ly4/b$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ly4/b$b;->a:Ly4/b$c;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, v1}, Ly4/b$c;->m(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final f(I)Ltg/P;
    .locals 3

    .line 1
    iget-object v0, p0, Ly4/b$b;->d:Ly4/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ly4/b$b;->b:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Ly4/b$b;->c:[Z

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    aput-boolean v2, v1, p1

    .line 12
    .line 13
    iget-object v1, p0, Ly4/b$b;->a:Ly4/b$c;

    .line 14
    .line 15
    invoke-virtual {v1}, Ly4/b$c;->c()Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {v0}, Ly4/b;->h(Ly4/b;)Ly4/b$e;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, p1

    .line 28
    check-cast v2, Ltg/P;

    .line 29
    .line 30
    invoke-static {v1, v2}, LL4/e;->a(Ltg/o;Ltg/P;)V

    .line 31
    .line 32
    .line 33
    check-cast p1, Ltg/P;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    monitor-exit v0

    .line 36
    return-object p1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    :try_start_1
    const-string p1, "editor is closed"

    .line 40
    .line 41
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :goto_0
    monitor-exit v0

    .line 48
    throw p1
.end method

.method public final g()Ly4/b$c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/b$b;->a:Ly4/b$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()[Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly4/b$b;->c:[Z

    .line 2
    .line 3
    return-object v0
.end method
