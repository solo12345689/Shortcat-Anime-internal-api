.class public final LS2/K$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS2/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:LS2/K;


# direct methods
.method public constructor <init>(Landroid/os/Handler;LS2/K;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroid/os/Handler;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput-object p1, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 15
    .line 16
    iput-object p2, p0, LS2/K$a;->b:LS2/K;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(LS2/K$a;Ljava/lang/String;JJ)V
    .locals 6

    .line 1
    iget-object p0, p0, LS2/K$a;->b:LS2/K;

    .line 2
    .line 3
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    move-object v0, p0

    .line 8
    check-cast v0, LS2/K;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    move-wide v2, p2

    .line 12
    move-wide v4, p4

    .line 13
    invoke-interface/range {v0 .. v5}, LS2/K;->i(Ljava/lang/String;JJ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic b(LS2/K$a;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    iget-object p0, p0, LS2/K$a;->b:LS2/K;

    .line 2
    .line 3
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LS2/K;

    .line 8
    .line 9
    invoke-interface {p0, p1}, LS2/K;->r(Ljava/lang/Exception;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic c(LS2/K$a;IJ)V
    .locals 0

    .line 1
    iget-object p0, p0, LS2/K$a;->b:LS2/K;

    .line 2
    .line 3
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LS2/K;

    .line 8
    .line 9
    invoke-interface {p0, p1, p2, p3}, LS2/K;->v(IJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic d(LS2/K$a;LA2/b;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, LA2/b;->c()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, LS2/K$a;->b:LS2/K;

    .line 8
    .line 9
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, LS2/K;

    .line 14
    .line 15
    invoke-interface {p0, p1}, LS2/K;->o(LA2/b;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static synthetic e(LS2/K$a;LA2/b;)V
    .locals 0

    .line 1
    iget-object p0, p0, LS2/K$a;->b:LS2/K;

    .line 2
    .line 3
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LS2/K;

    .line 8
    .line 9
    invoke-interface {p0, p1}, LS2/K;->s(LA2/b;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic f(LS2/K$a;Lq2/l0;)V
    .locals 0

    .line 1
    iget-object p0, p0, LS2/K$a;->b:LS2/K;

    .line 2
    .line 3
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LS2/K;

    .line 8
    .line 9
    invoke-interface {p0, p1}, LS2/K;->b(Lq2/l0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic g(LS2/K$a;JI)V
    .locals 0

    .line 1
    iget-object p0, p0, LS2/K$a;->b:LS2/K;

    .line 2
    .line 3
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LS2/K;

    .line 8
    .line 9
    invoke-interface {p0, p1, p2, p3}, LS2/K;->B(JI)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic h(LS2/K$a;Lq2/x;LA2/c;)V
    .locals 0

    .line 1
    iget-object p0, p0, LS2/K$a;->b:LS2/K;

    .line 2
    .line 3
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LS2/K;

    .line 8
    .line 9
    invoke-interface {p0, p1, p2}, LS2/K;->m(Lq2/x;LA2/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic i(LS2/K$a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, LS2/K$a;->b:LS2/K;

    .line 2
    .line 3
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LS2/K;

    .line 8
    .line 9
    invoke-interface {p0, p1}, LS2/K;->h(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic j(LS2/K$a;Ljava/lang/Object;J)V
    .locals 0

    .line 1
    iget-object p0, p0, LS2/K$a;->b:LS2/K;

    .line 2
    .line 3
    invoke-static {p0}, Lt2/a0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LS2/K;

    .line 8
    .line 9
    invoke-interface {p0, p1, p2, p3}, LS2/K;->x(Ljava/lang/Object;J)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public k(Ljava/lang/String;JJ)V
    .locals 8

    .line 1
    iget-object v0, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LS2/A;

    .line 6
    .line 7
    move-object v2, p0

    .line 8
    move-object v3, p1

    .line 9
    move-wide v4, p2

    .line 10
    move-wide v6, p4

    .line 11
    invoke-direct/range {v1 .. v7}, LS2/A;-><init>(LS2/K$a;Ljava/lang/String;JJ)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LS2/E;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LS2/E;-><init>(LS2/K$a;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public m(LA2/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, LA2/b;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, LS2/J;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, LS2/J;-><init>(LS2/K$a;LA2/b;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public n(IJ)V
    .locals 2

    .line 1
    iget-object v0, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LS2/F;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p2, p3}, LS2/F;-><init>(LS2/K$a;IJ)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public o(LA2/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LS2/H;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LS2/H;-><init>(LS2/K$a;LA2/b;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public p(Lq2/x;LA2/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LS2/I;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p2}, LS2/I;-><init>(LS2/K$a;Lq2/x;LA2/c;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public q(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-object v2, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 10
    .line 11
    new-instance v3, LS2/C;

    .line 12
    .line 13
    invoke-direct {v3, p0, p1, v0, v1}, LS2/C;-><init>(LS2/K$a;Ljava/lang/Object;J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public r(JI)V
    .locals 2

    .line 1
    iget-object v0, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LS2/G;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1, p2, p3}, LS2/G;-><init>(LS2/K$a;JI)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public s(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LS2/D;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LS2/D;-><init>(LS2/K$a;Ljava/lang/Exception;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public t(Lq2/l0;)V
    .locals 2

    .line 1
    iget-object v0, p0, LS2/K$a;->a:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, LS2/B;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, LS2/B;-><init>(LS2/K$a;Lq2/l0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
