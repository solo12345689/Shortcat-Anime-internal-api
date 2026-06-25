.class final LQ8/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LR8/c$c;
.implements LQ8/U;


# instance fields
.field private final a:LP8/a$f;

.field private final b:LQ8/b;

.field private c:LR8/j;

.field private d:Ljava/util/Set;

.field private e:Z

.field final synthetic f:LQ8/e;


# direct methods
.method public constructor <init>(LQ8/e;LP8/a$f;LQ8/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LQ8/I;->f:LQ8/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, LQ8/I;->c:LR8/j;

    .line 8
    .line 9
    iput-object p1, p0, LQ8/I;->d:Ljava/util/Set;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, LQ8/I;->e:Z

    .line 13
    .line 14
    iput-object p2, p0, LQ8/I;->a:LP8/a$f;

    .line 15
    .line 16
    iput-object p3, p0, LQ8/I;->b:LQ8/b;

    .line 17
    .line 18
    return-void
.end method

.method static bridge synthetic e(LQ8/I;)LP8/a$f;
    .locals 0

    .line 1
    iget-object p0, p0, LQ8/I;->a:LP8/a$f;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic f(LQ8/I;)LQ8/b;
    .locals 0

    .line 1
    iget-object p0, p0, LQ8/I;->b:LQ8/b;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic g(LQ8/I;Z)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, LQ8/I;->e:Z

    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic h(LQ8/I;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LQ8/I;->i()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final i()V
    .locals 3

    .line 1
    iget-boolean v0, p0, LQ8/I;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LQ8/I;->c:LR8/j;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, LQ8/I;->a:LP8/a$f;

    .line 10
    .line 11
    iget-object v2, p0, LQ8/I;->d:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v1, v0, v2}, LP8/a$f;->n(LR8/j;Ljava/util/Set;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ8/I;->f:LQ8/e;

    .line 2
    .line 3
    invoke-static {v0}, LQ8/e;->o(LQ8/e;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LQ8/H;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, LQ8/H;-><init>(LQ8/I;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final b(LR8/j;Ljava/util/Set;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-object p1, p0, LQ8/I;->c:LR8/j;

    .line 7
    .line 8
    iput-object p2, p0, LQ8/I;->d:Ljava/util/Set;

    .line 9
    .line 10
    invoke-direct {p0}, LQ8/I;->i()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string p2, "GoogleApiManager"

    .line 20
    .line 21
    const-string v0, "Received null response from onSignInSuccess"

    .line 22
    .line 23
    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    .line 27
    .line 28
    const/4 p2, 0x4

    .line 29
    invoke-direct {p1, p2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, LQ8/I;->c(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final c(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ8/I;->f:LQ8/e;

    .line 2
    .line 3
    invoke-static {v0}, LQ8/e;->x(LQ8/e;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LQ8/I;->b:LQ8/b;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LQ8/E;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, LQ8/E;->I(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final d(I)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ8/I;->f:LQ8/e;

    .line 2
    .line 3
    invoke-static {v0}, LQ8/e;->x(LQ8/e;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LQ8/I;->b:LQ8/b;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LQ8/E;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, LQ8/E;->M(LQ8/E;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-instance p1, Lcom/google/android/gms/common/ConnectionResult;

    .line 24
    .line 25
    const/16 v1, 0x11

    .line 26
    .line 27
    invoke-direct {p1, v1}, Lcom/google/android/gms/common/ConnectionResult;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, LQ8/E;->I(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-virtual {v0, p1}, LQ8/E;->e(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method
