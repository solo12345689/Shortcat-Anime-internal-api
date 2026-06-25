.class LF2/h$f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LF2/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field private final b:LF2/t$a;

.field private c:LF2/m;

.field private d:Z

.field final synthetic e:LF2/h;


# direct methods
.method public constructor <init>(LF2/h;LF2/t$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF2/h$f;->e:LF2/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LF2/h$f;->b:LF2/t$a;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic c(LF2/h$f;Lq2/x;)V
    .locals 4

    .line 1
    iget-object v0, p0, LF2/h$f;->e:LF2/h;

    .line 2
    .line 3
    invoke-static {v0}, LF2/h;->q(LF2/h;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, LF2/h$f;->d:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, LF2/h$f;->e:LF2/h;

    .line 15
    .line 16
    invoke-static {v0}, LF2/h;->k(LF2/h;)Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/os/Looper;

    .line 25
    .line 26
    iget-object v2, p0, LF2/h$f;->b:LF2/t$a;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {v0, v1, v2, p1, v3}, LF2/h;->l(LF2/h;Landroid/os/Looper;LF2/t$a;Lq2/x;Z)LF2/m;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, LF2/h$f;->c:LF2/m;

    .line 34
    .line 35
    iget-object p1, p0, LF2/h$f;->e:LF2/h;

    .line 36
    .line 37
    invoke-static {p1}, LF2/h;->j(LF2/h;)Ljava/util/Set;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic d(LF2/h$f;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LF2/h$f;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, LF2/h$f;->c:LF2/m;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, LF2/h$f;->b:LF2/t$a;

    .line 11
    .line 12
    invoke-interface {v0, v1}, LF2/m;->h(LF2/t$a;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, LF2/h$f;->e:LF2/h;

    .line 16
    .line 17
    invoke-static {v0}, LF2/h;->j(LF2/h;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, LF2/h$f;->d:Z

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LF2/h$f;->e:LF2/h;

    .line 2
    .line 3
    invoke-static {v0}, LF2/h;->p(LF2/h;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/os/Handler;

    .line 12
    .line 13
    new-instance v1, LF2/j;

    .line 14
    .line 15
    invoke-direct {v1, p0}, LF2/j;-><init>(LF2/h$f;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lt2/a0;->g1(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public e(Lq2/x;)V
    .locals 2

    .line 1
    iget-object v0, p0, LF2/h$f;->e:LF2/h;

    .line 2
    .line 3
    invoke-static {v0}, LF2/h;->p(LF2/h;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/os/Handler;

    .line 12
    .line 13
    new-instance v1, LF2/i;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, LF2/i;-><init>(LF2/h$f;Lq2/x;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method
