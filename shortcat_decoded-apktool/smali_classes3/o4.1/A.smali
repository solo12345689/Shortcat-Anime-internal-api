.class public Lo4/A;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field static final g:Ljava/lang/String;


# instance fields
.field final a:Landroidx/work/impl/utils/futures/c;

.field final b:Landroid/content/Context;

.field final c:Ln4/u;

.field final d:Landroidx/work/c;

.field final e:Li4/f;

.field final f:Lp4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkForegroundRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Li4/i;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lo4/A;->g:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ln4/u;Landroidx/work/c;Li4/f;Lp4/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroidx/work/impl/utils/futures/c;->u()Landroidx/work/impl/utils/futures/c;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lo4/A;->a:Landroidx/work/impl/utils/futures/c;

    .line 9
    .line 10
    iput-object p1, p0, Lo4/A;->b:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Lo4/A;->c:Ln4/u;

    .line 13
    .line 14
    iput-object p3, p0, Lo4/A;->d:Landroidx/work/c;

    .line 15
    .line 16
    iput-object p4, p0, Lo4/A;->e:Li4/f;

    .line 17
    .line 18
    iput-object p5, p0, Lo4/A;->f:Lp4/b;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic a(Lo4/A;Landroidx/work/impl/utils/futures/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo4/A;->a:Landroidx/work/impl/utils/futures/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/work/impl/utils/futures/a;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lo4/A;->d:Landroidx/work/c;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/work/c;->d()Lcom/google/common/util/concurrent/p;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p1, p0}, Landroidx/work/impl/utils/futures/c;->s(Lcom/google/common/util/concurrent/p;)Z

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 p0, 0x1

    .line 20
    invoke-virtual {p1, p0}, Landroidx/work/impl/utils/futures/a;->cancel(Z)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public b()Lcom/google/common/util/concurrent/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lo4/A;->a:Landroidx/work/impl/utils/futures/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lo4/A;->c:Ln4/u;

    .line 2
    .line 3
    iget-boolean v0, v0, Ln4/u;->q:Z

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Landroidx/work/impl/utils/futures/c;->u()Landroidx/work/impl/utils/futures/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lo4/A;->f:Lp4/b;

    .line 19
    .line 20
    invoke-interface {v1}, Lp4/b;->a()Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Lo4/z;

    .line 25
    .line 26
    invoke-direct {v2, p0, v0}, Lo4/z;-><init>(Lo4/A;Landroidx/work/impl/utils/futures/c;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lo4/A$a;

    .line 33
    .line 34
    invoke-direct {v1, p0, v0}, Lo4/A$a;-><init>(Lo4/A;Landroidx/work/impl/utils/futures/c;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lo4/A;->f:Lp4/b;

    .line 38
    .line 39
    invoke-interface {v2}, Lp4/b;->a()Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v1, v2}, Landroidx/work/impl/utils/futures/a;->k(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    :goto_0
    iget-object v0, p0, Lo4/A;->a:Landroidx/work/impl/utils/futures/c;

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/c;->q(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void
.end method
